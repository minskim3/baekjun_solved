#include <bits/stdc++.h>

#define  endl '\n'
using namespace std;
int adj[1001];
bool visited[1001];

int result;

void dfs(int x) {
    visited[x] = true;

    int cur = adj[x];

    if (!visited[cur]) {
        dfs(cur);
    } else
        result++;

}


int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int T, N;
    cin >> T;
    for (int i = 0; i < T; i++) {
        cin >> N; // 순열 크기 받기
        result = 0;

        for (int i = 1; i < N + 1; i++) // visit배열 초기화, adj배열에 넣기
        {
            visited[i] = false;
            cin >> adj[i];
        }

        for (int j = 1; j <= N; j++) { //방문하지 않았더라면 탐색 실행
            if (!visited[j])
                dfs(j);
        }
        cout << result << endl;
    }

    return 0;
}


