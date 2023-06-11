var switchElement = document.querySelector('input[type="checkbox"]');
var elementos = document.querySelectorAll('.card');

switchElement.addEventListener('change', function() {
  if (this.checked) {
    document.getElementById('body').classList.remove("fundo-claro");
    document.getElementById('body').classList.add("fundo-escuro");
    for (var i = 0; i < elementos.length; i++) {
      elementos[i].style.backgroundColor = '#7d7f81';
    }    
  } else {
    document.getElementById('body').classList.remove("fundo-escuro");
    document.getElementById('body').classList.add("fundo-claro");
    for (var i = 0; i < elementos.length; i++) {
      elementos[i].style.backgroundColor = '#9dbddd'
    }
   }
});