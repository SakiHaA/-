const isAgreed = document.querySelector('#check');
const btn = document.querySelector('#btn');

isAgreed.addEventListener('chenge', () => {
    btn.disabled = !isAgreed.checked;
});