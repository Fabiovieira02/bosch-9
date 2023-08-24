   </div>
            <div class="slide">
                <img src="./Robert-Bosch-Portrait_1200x503_0.jpg" alt="Imagen 2">
            </div>
            <div class="slide">
                <img src="imagen3.jpg" alt="Imagen 3">
            </div>
        </div>
        <div class="prev" onclick="prevSlide()">&#10094;</div>
        <div class="next" onclick="nextSlide()">&#10095;</div>
    </div>

    <script>
        let slideIndex = 0;

        function showSlide(index) {
            const slides = document.querySelectorAll(".slide");
            if (index < 0) {
                slideIndex = slides.length - 1;
            } else if (index >= slides.length) {
                slideIndex = 0;
            }
            for (let i = 0; i < slides.length; i++) {
                slides[i].style.transform = `translateX(-${slideIndex * 100}%)`;
            }
        }

        function prevSlide() {
            showSlide(slideIndex - 1);
        }

        function nextSlide() {
            showSlide(slideIndex + 1);
        }

        showSlide(slideIndex);
    </script>
