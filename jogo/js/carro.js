//posições dos carros
/* let xCarros1 = 630;
let xCarros2 = 630;
let xCarros3 = 630; */
let xCarros=[700,700,700,700,700,700]
let yCarros=[50,100,150,215,270,320]
let velocidadeCarros=[2,3.2,2.6,3.3,4.2,5]

let comprimentoCarros = 40;
let alturaCarros =30;




function mostrarCarros() {
    for (let i = 0; i < imagensCarros.length; i++) {
        image(imagensCarros[i],xCarros[i],yCarros[i], comprimentoCarros, alturaCarros);
        
    }
 /*    image(imagemDoCarro1,xCarros1,34, comprimentoCarros, alturaCarros);
    image(imagemDoCarro2,xCarros2,90, 50, 50);
    image(imagemDoCarro3,xCarros3,145, 50, 50); */
    
}

function movimentoCarro() {
    for (let i = 0; i < imagensCarros.length; i++) {
       xCarros[i] -= velocidadeCarros[i];

       if (xCarros[i]< -50) {
            xCarros[i]=700
        
       }
        
    }
}
