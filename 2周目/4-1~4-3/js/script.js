const loading = document.querySelector("#loading");
// 要素.classList.add("クラス名"); =>　クラスを追加する
// load => 全てのスタイルシートが読み込まれた時
window.addEventListener("load", () => {
    loading.classList.add("loaded");
});


// 上でやってることロードが出たらloadedでloadingを消すloadedを