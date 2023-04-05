const options = {
	method: 'GET',
	headers: {
		'X-RapidAPI-Key': '8dd951810amsh20cc3c9321001a4p17594fjsn8965a24304d9',
		'X-RapidAPI-Host': 'quotes15.p.rapidapi.com'
	}
};

fetch('https://quotes15.p.rapidapi.com/quotes/random/', options)
	.then(response => response.json())
	.then(response => 
        {console.log(response);
		
		if(response.content !== undefined){
			document.getElementById('quote').innerHTML = response.content;
			document.getElementById('author').innerHTML = '- ' + response.originator.name + ' -';
		}else{
			document.getElementById('quote').innerHTML = 'Pediste demasiadas frases. <br> <br>Por favor, recarregue a página.';
			document.getElementById('author').innerHTML = '';
		}

    })
	.catch(err => {console.error(err);}
);
