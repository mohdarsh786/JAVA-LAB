import numpy as np
import pandas as pd
import tensorflow as tf
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import LSTM, Dense, Dropout
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import LabelEncoder
from sklearn.metrics import classification_report  # Added import

num_samples = 5000
timesteps = 50
features = 6

X = np.random.randn(num_samples, timesteps, features)
y_labels = np.random.choice(['Walking', 'Running', 'Sitting'], num_samples)

label_encoder = LabelEncoder()
y = label_encoder.fit_transform(y_labels)  # Corrected typo

# One-hot encode labels for classification
y = tf.keras.utils.to_categorical(y)

# Split into Train & Test sets
X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.2, random_state=42
)

# Build the LSTM model
model = Sequential(
    [
        LSTM(64, return_sequences=True, input_shape=(timesteps, features)),
        Dropout(0.2),
        LSTM(32),
        Dense(16, activation="relu"), #changed from 26 to 16.
        Dense(y.shape[1], activation="softmax"),
    ]
)

model.compile(
    loss="categorical_crossentropy", optimizer="adam", metrics=["accuracy"]
)

model.fit(
    X_train,
    y_train,
    epochs=10,
    batch_size=32,
    validation_data=(X_test, y_test),
)

y_pred = model.predict(X_test)
y_pred_labels = np.argmax(y_pred, axis=1)
y_test_labels = np.argmax(y_test, axis=1)

print(
    classification_report(
        y_test_labels,
        y_pred_labels,
        target_names=label_encoder.classes_,
    )
)