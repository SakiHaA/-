// document.querySelector("セレクター")
// オブジェクト.メソッド("パラメーター")
// ↓オブジェクト.IDの要素("パラメーター").要素内のテキスト = その値
// document.querySelector("#colorText").textContent = document.querySelector("#colorText").value


// 簡略して書く

const text = document.querySelector("#colorText");
const color = document.querySelector("#colorPicker");
// ``で文字列と変数繋げる 　${}でそれ以外をくっつける
// text.textContent = `カラーコード:${color.value}`;

const colorBg = () => {
    // 選択した色を背景色に設定 background-color => backgroundColor
    document.body.style.backgroundColor = color.value;
    
// カラーコードを表示
    if (color.value === "#ffffff") {
        text.textContent = `カラーコード:${color.value} (white)`;
    } else if (color.value === "#000000") {
        text.textContent = `カラーコード:${color.value} (black)`;
    } else {
        text.textContent = `カラーコード:${color.value}`
    }
}
// addEventListener(どうなったら,どうなる);
// ~を.addEventListener(入力したら,colorBgを発動させる)
color.addEventListener("input", colorBg);

//↑ if(条件){
　　// ↑ 条件を満たした時の処理
//↑ }

//↑ if(条件){
　　// ↑ 条件を満たした時の処理
//↑ } else {
    // ↑ 条件を満たさないときの処理
// }