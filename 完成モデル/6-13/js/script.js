const showKirin = (entries) => {
    const keyframes = {
        opacity: [0, 1],
        translate: ["200px 0", 0],
    };
    entries[0].target.animate(keyframes, 600);
};

const kirinObserver = new IntersectionObserver(showKirin);

kirinObserver.observe(document.querySelector("#kirin"));