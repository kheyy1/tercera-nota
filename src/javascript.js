let numero1 = Number(prompt("Ingrese el primer numero"));
let numero2 = Number(prompt("Ingrese el segundo numero"));
let numero3 = Number(prompt("Ingrese el tercer numero"));
if (numero1 > numero2 && numero1 > numero3) {
    console.log(`El numero mayor es ${numero1}`);
} else if (numero2 > numero1 && numero2 > numero3) {
    console.log(`El numero mayor es ${numero2}`);
} else {
    console.log(`El numero mayor es ${numero3}`);
}