Lancer ces images docker (docker run -d -p ?:? -d $imagename) en déterminant quel port a besoin d'être mappé, ensuite aller visiter votre conteneur sur le port exposé pour valider le mapping de port.
Indice : les ports exposés sont visibles via un docker ps

nom des images :
- doandrewshawcare/random-beer-selector
- elasticsearch
- tomcat:8.0
- macinv/gunicorn-example
- mongo
- rabbitmq:3-management