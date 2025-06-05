#include <iostream> 
#include <unordered_map> 
#include <vector>
#include <algorithm> 
using namespace std; 
int main()
{
    int n;
    cin >> n;
    unordered_map<char, int> freqMap; vector<char> chars(n);
    for (int i = 0; i < n; ++i)
    {
        cin >> chars[i]; freqMap[chars[i]]++;
    }
    vector<char> uniqueChars;
    for (const auto& pair : freqMap)
    {
        uniqueChars.push_back(pair.first);
    }	
    sort(uniqueChars.begin(),uniqueChars.end()); 
    for (char ch : uniqueChars)
    {
        cout << ch << " " << freqMap[ch] << endl;
    }
    return 0;
}
