# Auth0 ログインテスト

## Visual Studio Codeにインストールする拡張機能
1. Debugger for Java
1. Extension Pack for Java
1. Spring Boot Extension Pack

## 実行手順（Visual Studio Code利用）
1. <kbd>Ctrl</kbd>+<kbd>Shift</kbd>+<kbd>G</kbd> 押下
1. リポジトリのクローン
1. GitHub から複製
1. `https://github.com/JAEHAKLEE02/iibc.git`を選択
1. クローンしたリポジトリを開く
1. <kbd>Ctrl</kbd>+<kbd>@</kbd> 押下
1. `docker-compose build` 実行
1. `docker-compose up -d` 実行

## 動作確認方法
1. [http://localhost:8081/](http://localhost:8081/)接続
2. GoogleでログインorGoogleで続ける選択
3. Login Success画面が出力
4. 右上のアイコンのProfile押下（Jsonデータ表示）
5. 右上のアイコンのLogout押下
6. Logout確認画面表示→Logout押下
7. １のログイン画面が再表示

## 終了手順
1. `docker-compose down -v` 実行
