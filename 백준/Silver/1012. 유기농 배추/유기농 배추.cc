#include <bits/stdc++.h>

#define  endl '\n'
using namespace std;

int cabbage[50][50];
bool visited[50][50];
int xpos[4] = {0, 0, 1, -1};
int ypos[4] = {1, -1, 0, 0};

int N, M;

void dfs(int a, int b) {
    cabbage[a][b] = 0;
    for (int i = 0; i < 4; i++) {
        int xx = a + xpos[i];
        int yy = b + ypos[i];
        if ((xx >= M) || (yy >= N) || (xx < 0) || (yy < 0)) continue;
        if (cabbage[xx][yy] == 1) {
            dfs(xx, yy);
        }
    }


}


int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int T, K, ans;

    cin >> T;

    for (int q = 0; q < T; q++) {
        cin >> M >> N >> K;
        //밭 만들기
        ans = 0;
        for (int i = 0; i < M; i++)
            fill(cabbage[i], cabbage[i] + N, 0);

        //밭에 있는 배추 심기
        for (int i = 0; i < K; i++) {
            int x, y;
            cin >> x >> y;
            cabbage[x][y] = 1;
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (cabbage[i][j] == 1) {
                    dfs(i, j);
                    ans++;
                }
            }
        }
        cout << ans << endl;
    }

    return 0;
}


