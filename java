{
    "files.autoSave": "afterDelay"
}

const slides = document.querySelectorAll('.slide');
const nextBtn = document.getElementById('nextBtn');
let currentIndex = 0;

nextBtn.addEventListener('click', () => {
  slides[currentIndex].classList.remove('active');
  currentIndex = (currentIndex + 1) % slides.length;
  slides[currentIndex].classList.add('active');
});


</script>
