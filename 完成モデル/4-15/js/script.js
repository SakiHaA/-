const getScrollPercent = () => {
    const scrolled = window.scrolly;
    console.log(`${scrolled}スクロールされました`);
    
    const pageHeight = document.documentElement.scrollHeight;
    
    const viewHeight = document.documentElementclientHeight;
    
    console.log(`ページの高さ :${pageHeight}、表示領域の高さ :${viewHeight}`)
}

window.addEventListener('scroll', getScrollPercent);