Funcionalidade: Logar no site  
**Eu** como Usuário  
**Quero** fazer login no site FastGv  
**Para** acessar a pagina inicial
---
Cenário: Logar com sucesso   
**Dado** que estou na pagina de login FastGv     
**Quando** preencho o campo usuário com um usuário valido   
**E** clico no campo senha   
**E** preencho com uma senha valida
**E** clico em "Entrar"   
**Então** sou direcionado para a pagina "Escolha sua Filial"
---
Cenário: Escolher a filial   
**Dado** que estou logado a no site FastGv   
**Quando** clico no campo "filiais"   
**E** seleciono a loja específica   
**E** clico em "Entrar"   
**Então** sou direcionada a pagina inicial   


----

Funcionalidade: Abertura de Caixa  
**Eu** como Usuário  
**Quero** Abrir o caixa no site FastGv  
**Para** Realizar/Alterar/Cancelar Pedidos
---
Cenário: Abrir o caixa   
**Dado** que estou logado no site FastGv     
**Quando** clico no botão "Abrir Caixa"   
**E** digito o Saldo inicial   
**E** seleciono o número do PDV
**E** clico em "Abrir"     
**Então** visualizo a mensagem "Caixa Aberto!"