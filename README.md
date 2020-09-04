# webservice-achieve

[![license](https://img.shields.io/badge/license-MIT-green.svg?style=flat&logo=github)](https://www.mit-license.org)
[![java](https://img.shields.io/badge/java-1.8-brightgreen.svg?style=flat&logo=java)](https://www.oracle.com/java/technologies/javase-downloads.html)
[![gradle](https://img.shields.io/badge/gradle-6.3-brightgreen.svg?style=flat&logo=gradle)](https://docs.gradle.org/6.3/userguide/installation.html)
[![release](https://img.shields.io/badge/release-0.1.0-blue.svg)](https://github.com/aaric/webservice-achieve/releases)

> WebService CXF Learning.

## wsdl2java

```bash
# HelloWebServiceTests
sh> wsdl2java -p cn.com.infosec.ra.webservice \
  -d C:\Users\hanqi\Desktop\wsdl \
  http://36.110.10.186:50072/NetCertRA6.3.0.1/equipmentCertService.wsdl

# EquipmentCertServiceTests
sh> wsdl2java -p cn.com.infosec.ra.webservice \
  -d C:\Users\hanqi\Desktop\wsdl \
  http://36.110.10.186:50072/NetCertRA6.3.0.1/equipmentCertService.wsdl
```
