var url_contact = "http://localhost:8888/contact";

function submitForm() {
    const form = document.querySelector('form');
    
    if (!form.checkValidity()) {
      // If the form is invalid, don't submit it
      return;
    }
    
    const formData = new FormData(form);
    
    fetch(url_contact, {
      method: 'POST',
      body: formData
    })
    .then(response => {
      if (response.ok) {
        alert('Formulario enviado correctamente');
        form.reset();
      } else {
        alert('Error al enviar formulario');
      }
    })
    .catch(error => {
      alert('Error al enviar formulario');
    });
  }
  
const submitButton = document.querySelector('button[type="submit"]');
submitButton.addEventListener('click', (event) => {
event.preventDefault();
submitForm();
});
  
