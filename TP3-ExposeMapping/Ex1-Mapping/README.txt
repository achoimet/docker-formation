Lancer ces images docker en déterminant quel port a besoin d'être mappé, ensuite aller visiter votre conteneur sur le port exposé pour valider le mapping de port.
Indice : les ports exposés sont visibles via un docker ps

d'abord     docker run -d   $nomdel'image
ensuite docker ps        pour voir le port exposé
docker stop $nomdel'image
et enfin  docker run -d -p ??:?? $nomdel'image

nom des images :
- doandrewshawcare/random-beer-selector
- elasticsearch
- tomcat:8.0
- macinv/gunicorn-example
- mongo
- rabbitmq:3-management
