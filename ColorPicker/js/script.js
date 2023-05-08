const text = document.querySelector('#colorText');
const color = document.querySelector('#colorPicker');

const colorBg = () => {
    //選択した色も背景色になる//
    document.body.style.backgroundColor = color.value;
    
    //カラーコードを表示//
    if (color.value === '#ffffff') {
        text.textContent = `カラーコード: ${color.value} (white)`;
    }   else if (color.value === '#000000') {
        text.textContent = `カラーコード: ${color.value} (black)`;
    }   else {
        text.textContent = `カラーコード: ${color.value}`;
    }
}

//カラーピッカーが変更されたらcolorBgの関数が作動する//
color.addEventListener('input', colorBg);