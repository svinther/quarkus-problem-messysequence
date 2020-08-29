# start db

```
docker run --ulimit memlock=-1:-1 -d --rm=true --memory-swappiness=0 \
       --name postgres-quarkus-hibernate -e POSTGRES_USER=hibernate \
       -e POSTGRES_PASSWORD=hibernate \
       -p 5432:5432 postgres:10.5

#Wait for initdb
sleep 5

docker exec -ti postgres-quarkus-hibernate psql -U hibernate -c "CREATE DATABASE hibernate_db"       
docker exec -ti postgres-quarkus-hibernate psql -U hibernate -c "CREATE TABLE Gift(id bigint primary key, name text)" hibernate_db
docker exec -ti postgres-quarkus-hibernate psql -U hibernate -c "CREATE sequence gift_id_seq" hibernate_db

```

# Test output

```
/usr/lib/jvm/java-11-openjdk-amd64/bin/java -agentlib:jdwp=transport=dt_socket,address=127.0.0.1:47665,suspend=y,server=n -ea -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dmaven.home=/snap/intellij-idea-ultimate/242/plugins/maven/lib/maven3 -Didea.test.cyclic.buffer.size=1048576 -javaagent:/snap/intellij-idea-ultimate/242/plugins/java/lib/rt/debugger-agent.jar -Dfile.encoding=UTF-8 -classpath /snap/intellij-idea-ultimate/242/lib/idea_rt.jar:/home/svs/.m2/repository/org/junit/platform/junit-platform-launcher/1.6.2/junit-platform-launcher-1.6.2.jar:/snap/intellij-idea-ultimate/242/plugins/junit/lib/junit5-rt.jar:/snap/intellij-idea-ultimate/242/plugins/junit/lib/junit-rt.jar:/home/svs/develop/quarkus-problem-messysequence/target/test-classes:/home/svs/develop/quarkus-problem-messysequence/target/classes:/home/svs/.m2/repository/io/quarkus/quarkus-resteasy/1.7.0.Final/quarkus-resteasy-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-vertx-http/1.7.0.Final/quarkus-vertx-http-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-security-runtime-spi/1.7.0.Final/quarkus-security-runtime-spi-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-development-mode-spi/1.7.0.Final/quarkus-development-mode-spi-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/security/quarkus-security/1.1.2.Final/quarkus-security-1.1.2.Final.jar:/home/svs/.m2/repository/io/smallrye/reactive/mutiny/0.7.0/mutiny-0.7.0.jar:/home/svs/.m2/repository/jakarta/enterprise/jakarta.enterprise.cdi-api/2.0.2/jakarta.enterprise.cdi-api-2.0.2.jar:/home/svs/.m2/repository/jakarta/el/jakarta.el-api/3.0.3/jakarta.el-api-3.0.3.jar:/home/svs/.m2/repository/jakarta/interceptor/jakarta.interceptor-api/1.2.5/jakarta.interceptor-api-1.2.5.jar:/home/svs/.m2/repository/io/quarkus/quarkus-vertx-core/1.7.0.Final/quarkus-vertx-core-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-netty/1.7.0.Final/quarkus-netty-1.7.0.Final.jar:/home/svs/.m2/repository/io/netty/netty-codec/4.1.49.Final/netty-codec-4.1.49.Final.jar:/home/svs/.m2/repository/io/netty/netty-handler/4.1.49.Final/netty-handler-4.1.49.Final.jar:/home/svs/.m2/repository/io/vertx/vertx-core/3.9.2/vertx-core-3.9.2.jar:/home/svs/.m2/repository/io/netty/netty-common/4.1.49.Final/netty-common-4.1.49.Final.jar:/home/svs/.m2/repository/io/netty/netty-buffer/4.1.49.Final/netty-buffer-4.1.49.Final.jar:/home/svs/.m2/repository/io/netty/netty-transport/4.1.49.Final/netty-transport-4.1.49.Final.jar:/home/svs/.m2/repository/io/netty/netty-handler-proxy/4.1.49.Final/netty-handler-proxy-4.1.49.Final.jar:/home/svs/.m2/repository/io/netty/netty-codec-socks/4.1.49.Final/netty-codec-socks-4.1.49.Final.jar:/home/svs/.m2/repository/io/netty/netty-codec-http/4.1.49.Final/netty-codec-http-4.1.49.Final.jar:/home/svs/.m2/repository/io/netty/netty-codec-http2/4.1.49.Final/netty-codec-http2-4.1.49.Final.jar:/home/svs/.m2/repository/io/netty/netty-resolver/4.1.49.Final/netty-resolver-4.1.49.Final.jar:/home/svs/.m2/repository/io/netty/netty-resolver-dns/4.1.49.Final/netty-resolver-dns-4.1.49.Final.jar:/home/svs/.m2/repository/io/netty/netty-codec-dns/4.1.49.Final/netty-codec-dns-4.1.49.Final.jar:/home/svs/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.11.2/jackson-core-2.11.2.jar:/home/svs/.m2/repository/io/vertx/vertx-web/3.9.2/vertx-web-3.9.2.jar:/home/svs/.m2/repository/io/vertx/vertx-web-common/3.9.2/vertx-web-common-3.9.2.jar:/home/svs/.m2/repository/io/vertx/vertx-auth-common/3.9.2/vertx-auth-common-3.9.2.jar:/home/svs/.m2/repository/io/vertx/vertx-bridge-common/3.9.2/vertx-bridge-common-3.9.2.jar:/home/svs/.m2/repository/io/quarkus/quarkus-resteasy-server-common/1.7.0.Final/quarkus-resteasy-server-common-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-arc/1.7.0.Final/quarkus-arc-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/arc/arc/1.7.0.Final/arc-1.7.0.Final.jar:/home/svs/.m2/repository/org/eclipse/microprofile/context-propagation/microprofile-context-propagation-api/1.0.1/microprofile-context-propagation-api-1.0.1.jar:/home/svs/.m2/repository/io/quarkus/quarkus-resteasy-common/1.7.0.Final/quarkus-resteasy-common-1.7.0.Final.jar:/home/svs/.m2/repository/org/jboss/resteasy/resteasy-core/4.5.6.Final/resteasy-core-4.5.6.Final.jar:/home/svs/.m2/repository/org/jboss/spec/javax/ws/rs/jboss-jaxrs-api_2.1_spec/2.0.1.Final/jboss-jaxrs-api_2.1_spec-2.0.1.Final.jar:/home/svs/.m2/repository/org/jboss/resteasy/resteasy-core-spi/4.5.6.Final/resteasy-core-spi-4.5.6.Final.jar:/home/svs/.m2/repository/com/ibm/async/asyncutil/0.1.0/asyncutil-0.1.0.jar:/home/svs/.m2/repository/org/eclipse/microprofile/config/microprofile-config-api/1.4/microprofile-config-api-1.4.jar:/home/svs/.m2/repository/jakarta/validation/jakarta.validation-api/2.0.2/jakarta.validation-api-2.0.2.jar:/home/svs/.m2/repository/io/quarkus/quarkus-hibernate-orm/1.7.0.Final/quarkus-hibernate-orm-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-core/1.7.0.Final/quarkus-core-1.7.0.Final.jar:/home/svs/.m2/repository/jakarta/annotation/jakarta.annotation-api/1.3.5/jakarta.annotation-api-1.3.5.jar:/home/svs/.m2/repository/jakarta/inject/jakarta.inject-api/1.0/jakarta.inject-api-1.0.jar:/home/svs/.m2/repository/io/quarkus/quarkus-ide-launcher/1.7.0.Final/quarkus-ide-launcher-1.7.0.Final.jar:/home/svs/.m2/repository/io/smallrye/config/smallrye-config/1.8.5/smallrye-config-1.8.5.jar:/home/svs/.m2/repository/io/smallrye/common/smallrye-common-annotation/1.1.0/smallrye-common-annotation-1.1.0.jar:/home/svs/.m2/repository/io/smallrye/config/smallrye-config-common/1.8.5/smallrye-config-common-1.8.5.jar:/home/svs/.m2/repository/io/smallrye/common/smallrye-common-expression/1.1.0/smallrye-common-expression-1.1.0.jar:/home/svs/.m2/repository/io/smallrye/common/smallrye-common-function/1.1.0/smallrye-common-function-1.1.0.jar:/home/svs/.m2/repository/io/smallrye/common/smallrye-common-constraint/1.1.0/smallrye-common-constraint-1.1.0.jar:/home/svs/.m2/repository/org/jboss/logging/jboss-logging/3.3.2.Final/jboss-logging-3.3.2.Final.jar:/home/svs/.m2/repository/org/jboss/logmanager/jboss-logmanager-embedded/1.0.4/jboss-logmanager-embedded-1.0.4.jar:/home/svs/.m2/repository/org/jboss/logging/jboss-logging-annotations/2.1.0.Final/jboss-logging-annotations-2.1.0.Final.jar:/home/svs/.m2/repository/org/jboss/threads/jboss-threads/3.1.1.Final/jboss-threads-3.1.1.Final.jar:/home/svs/.m2/repository/org/slf4j/slf4j-api/1.7.30/slf4j-api-1.7.30.jar:/home/svs/.m2/repository/org/jboss/slf4j/slf4j-jboss-logging/1.2.0.Final/slf4j-jboss-logging-1.2.0.Final.jar:/home/svs/.m2/repository/org/graalvm/sdk/graal-sdk/20.1.0/graal-sdk-20.1.0.jar:/home/svs/.m2/repository/org/wildfly/common/wildfly-common/1.5.4.Final-format-001/wildfly-common-1.5.4.Final-format-001.jar:/home/svs/.m2/repository/io/quarkus/quarkus-bootstrap-runner/1.7.0.Final/quarkus-bootstrap-runner-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-agroal/1.7.0.Final/quarkus-agroal-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-datasource/1.7.0.Final/quarkus-datasource-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-datasource-common/1.7.0.Final/quarkus-datasource-common-1.7.0.Final.jar:/home/svs/.m2/repository/org/jboss/narayana/jta/narayana-jta/5.10.5.Final/narayana-jta-5.10.5.Final.jar:/home/svs/.m2/repository/org/jboss/jboss-transaction-spi/7.6.0.Final/jboss-transaction-spi-7.6.0.Final.jar:/home/svs/.m2/repository/org/jboss/spec/javax/resource/jboss-connector-api_1.7_spec/1.0.0.Final/jboss-connector-api_1.7_spec-1.0.0.Final.jar:/home/svs/.m2/repository/org/jboss/narayana/jts/narayana-jts-integration/5.10.5.Final/narayana-jts-integration-5.10.5.Final.jar:/home/svs/.m2/repository/io/agroal/agroal-api/1.8/agroal-api-1.8.jar:/home/svs/.m2/repository/io/agroal/agroal-narayana/1.8/agroal-narayana-1.8.jar:/home/svs/.m2/repository/io/agroal/agroal-pool/1.8/agroal-pool-1.8.jar:/home/svs/.m2/repository/io/quarkus/quarkus-credentials/1.7.0.Final/quarkus-credentials-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-narayana-jta/1.7.0.Final/quarkus-narayana-jta-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-mutiny/1.7.0.Final/quarkus-mutiny-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-smallrye-context-propagation/1.7.0.Final/quarkus-smallrye-context-propagation-1.7.0.Final.jar:/home/svs/.m2/repository/io/smallrye/smallrye-context-propagation/1.0.13/smallrye-context-propagation-1.0.13.jar:/home/svs/.m2/repository/io/smallrye/smallrye-context-propagation-api/1.0.13/smallrye-context-propagation-api-1.0.13.jar:/home/svs/.m2/repository/io/smallrye/reactive/mutiny-context-propagation/0.7.0/mutiny-context-propagation-0.7.0.jar:/home/svs/.m2/repository/io/smallrye/smallrye-context-propagation-jta/1.0.13/smallrye-context-propagation-jta-1.0.13.jar:/home/svs/.m2/repository/io/smallrye/reactive/smallrye-reactive-converter-api/1.1.0/smallrye-reactive-converter-api-1.1.0.jar:/home/svs/.m2/repository/org/reactivestreams/reactive-streams/1.0.3/reactive-streams-1.0.3.jar:/home/svs/.m2/repository/io/smallrye/reactive/smallrye-reactive-converter-mutiny/1.1.0/smallrye-reactive-converter-mutiny-1.1.0.jar:/home/svs/.m2/repository/org/hibernate/hibernate-core/5.4.19.Final/hibernate-core-5.4.19.Final.jar:/home/svs/.m2/repository/net/bytebuddy/byte-buddy/1.10.10/byte-buddy-1.10.10.jar:/home/svs/.m2/repository/antlr/antlr/2.7.7/antlr-2.7.7.jar:/home/svs/.m2/repository/org/jboss/jandex/2.2.1.Final/jandex-2.2.1.Final.jar:/home/svs/.m2/repository/com/fasterxml/classmate/1.3.4/classmate-1.3.4.jar:/home/svs/.m2/repository/org/dom4j/dom4j/2.1.3/dom4j-2.1.3.jar:/home/svs/.m2/repository/org/hibernate/common/hibernate-commons-annotations/5.1.0.Final/hibernate-commons-annotations-5.1.0.Final.jar:/home/svs/.m2/repository/org/hibernate/hibernate-graalvm/5.4.19.Final/hibernate-graalvm-5.4.19.Final.jar:/home/svs/.m2/repository/org/glassfish/jaxb/jaxb-runtime/2.3.3-b02/jaxb-runtime-2.3.3-b02.jar:/home/svs/.m2/repository/org/glassfish/jaxb/txw2/2.3.3-b02/txw2-2.3.3-b02.jar:/home/svs/.m2/repository/com/sun/istack/istack-commons-runtime/3.0.10/istack-commons-runtime-3.0.10.jar:/home/svs/.m2/repository/com/sun/activation/jakarta.activation/1.2.1/jakarta.activation-1.2.1.jar:/home/svs/.m2/repository/org/jboss/spec/javax/xml/bind/jboss-jaxb-api_2.3_spec/2.0.0.Final/jboss-jaxb-api_2.3_spec-2.0.0.Final.jar:/home/svs/.m2/repository/jakarta/persistence/jakarta.persistence-api/2.2.3/jakarta.persistence-api-2.2.3.jar:/home/svs/.m2/repository/jakarta/transaction/jakarta.transaction-api/1.3.3/jakarta.transaction-api-1.3.3.jar:/home/svs/.m2/repository/org/hibernate/quarkus-local-cache/0.1.0/quarkus-local-cache-0.1.0.jar:/home/svs/.m2/repository/com/github/ben-manes/caffeine/caffeine/2.8.5/caffeine-2.8.5.jar:/home/svs/.m2/repository/com/google/errorprone/error_prone_annotations/2.2.0/error_prone_annotations-2.2.0.jar:/home/svs/.m2/repository/io/quarkus/quarkus-caffeine/1.7.0.Final/quarkus-caffeine-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-jdbc-postgresql/1.7.0.Final/quarkus-jdbc-postgresql-1.7.0.Final.jar:/home/svs/.m2/repository/org/postgresql/postgresql/42.2.14/postgresql-42.2.14.jar:/home/svs/.m2/repository/io/quarkus/quarkus-resteasy-jsonb/1.7.0.Final/quarkus-resteasy-jsonb-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-jsonb/1.7.0.Final/quarkus-jsonb-1.7.0.Final.jar:/home/svs/.m2/repository/org/eclipse/yasson/1.0.7/yasson-1.0.7.jar:/home/svs/.m2/repository/io/quarkus/quarkus-jsonp/1.7.0.Final/quarkus-jsonp-1.7.0.Final.jar:/home/svs/.m2/repository/org/jboss/resteasy/resteasy-json-binding-provider/4.5.6.Final/resteasy-json-binding-provider-4.5.6.Final.jar:/home/svs/.m2/repository/org/glassfish/jakarta.json/1.1.6/jakarta.json-1.1.6.jar:/home/svs/.m2/repository/jakarta/json/bind/jakarta.json.bind-api/1.0.2/jakarta.json.bind-api-1.0.2.jar:/home/svs/.m2/repository/org/jboss/resteasy/resteasy-json-p-provider/4.5.6.Final/resteasy-json-p-provider-4.5.6.Final.jar:/home/svs/.m2/repository/commons-io/commons-io/2.6/commons-io-2.6.jar:/home/svs/.m2/repository/io/quarkus/quarkus-junit5/1.7.0.Final/quarkus-junit5-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-bootstrap-core/1.7.0.Final/quarkus-bootstrap-core-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-bootstrap-app-model/1.7.0.Final/quarkus-bootstrap-app-model-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-bootstrap-maven-resolver/1.7.0.Final/quarkus-bootstrap-maven-resolver-1.7.0.Final.jar:/home/svs/.m2/repository/org/ow2/asm/asm/8.0.1/asm-8.0.1.jar:/home/svs/.m2/repository/org/apache/maven/maven-embedder/3.6.3/maven-embedder-3.6.3.jar:/home/svs/.m2/repository/org/apache/maven/maven-settings/3.6.3/maven-settings-3.6.3.jar:/home/svs/.m2/repository/org/apache/maven/maven-core/3.6.3/maven-core-3.6.3.jar:/home/svs/.m2/repository/org/apache/maven/maven-artifact/3.6.3/maven-artifact-3.6.3.jar:/home/svs/.m2/repository/org/codehaus/plexus/plexus-component-annotations/2.1.0/plexus-component-annotations-2.1.0.jar:/home/svs/.m2/repository/org/apache/maven/maven-plugin-api/3.6.3/maven-plugin-api-3.6.3.jar:/home/svs/.m2/repository/org/apache/maven/maven-model/3.6.3/maven-model-3.6.3.jar:/home/svs/.m2/repository/org/apache/maven/maven-model-builder/3.6.3/maven-model-builder-3.6.3.jar:/home/svs/.m2/repository/org/apache/maven/maven-builder-support/3.6.3/maven-builder-support-3.6.3.jar:/home/svs/.m2/repository/org/apache/maven/resolver/maven-resolver-api/1.4.1/maven-resolver-api-1.4.1.jar:/home/svs/.m2/repository/org/apache/maven/resolver/maven-resolver-util/1.4.1/maven-resolver-util-1.4.1.jar:/home/svs/.m2/repository/org/apache/maven/shared/maven-shared-utils/3.2.1/maven-shared-utils-3.2.1.jar:/home/svs/.m2/repository/com/google/inject/guice/4.2.1/guice-4.2.1-no_aop.jar:/home/svs/.m2/repository/com/google/guava/guava/27.0.1-jre/guava-27.0.1-jre.jar:/home/svs/.m2/repository/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar:/home/svs/.m2/repository/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar:/home/svs/.m2/repository/org/codehaus/plexus/plexus-utils/3.2.1/plexus-utils-3.2.1.jar:/home/svs/.m2/repository/org/codehaus/plexus/plexus-classworlds/2.5.2/plexus-classworlds-2.5.2.jar:/home/svs/.m2/repository/commons-cli/commons-cli/1.4/commons-cli-1.4.jar:/home/svs/.m2/repository/org/eclipse/sisu/org.eclipse.sisu.plexus/0.3.4/org.eclipse.sisu.plexus-0.3.4.jar:/home/svs/.m2/repository/org/apache/maven/maven-settings-builder/3.6.3/maven-settings-builder-3.6.3.jar:/home/svs/.m2/repository/org/codehaus/plexus/plexus-interpolation/1.25/plexus-interpolation-1.25.jar:/home/svs/.m2/repository/org/sonatype/plexus/plexus-sec-dispatcher/1.4/plexus-sec-dispatcher-1.4.jar:/home/svs/.m2/repository/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.jar:/home/svs/.m2/repository/org/apache/maven/maven-resolver-provider/3.6.3/maven-resolver-provider-3.6.3.jar:/home/svs/.m2/repository/org/apache/maven/maven-repository-metadata/3.6.3/maven-repository-metadata-3.6.3.jar:/home/svs/.m2/repository/org/apache/maven/resolver/maven-resolver-spi/1.4.1/maven-resolver-spi-1.4.1.jar:/home/svs/.m2/repository/org/apache/maven/resolver/maven-resolver-impl/1.4.1/maven-resolver-impl-1.4.1.jar:/home/svs/.m2/repository/org/apache/maven/resolver/maven-resolver-connector-basic/1.4.1/maven-resolver-connector-basic-1.4.1.jar:/home/svs/.m2/repository/org/apache/maven/resolver/maven-resolver-transport-wagon/1.4.1/maven-resolver-transport-wagon-1.4.1.jar:/home/svs/.m2/repository/org/apache/maven/wagon/wagon-http/3.3.4/wagon-http-3.3.4.jar:/home/svs/.m2/repository/org/apache/maven/wagon/wagon-http-shared/3.3.4/wagon-http-shared-3.3.4.jar:/home/svs/.m2/repository/org/jsoup/jsoup/1.12.1/jsoup-1.12.1.jar:/home/svs/.m2/repository/org/apache/maven/wagon/wagon-provider-api/3.3.4/wagon-provider-api-3.3.4.jar:/home/svs/.m2/repository/org/apache/maven/wagon/wagon-file/3.3.4/wagon-file-3.3.4.jar:/home/svs/.m2/repository/io/quarkus/quarkus-bootstrap-gradle-resolver/1.7.0.Final/quarkus-bootstrap-gradle-resolver-1.7.0.Final.jar:/home/svs/.m2/repository/io/smallrye/common/smallrye-common-io/1.1.0/smallrye-common-io-1.1.0.jar:/home/svs/.m2/repository/org/eclipse/sisu/org.eclipse.sisu.inject/0.3.4/org.eclipse.sisu.inject-0.3.4.jar:/home/svs/.m2/repository/io/quarkus/quarkus-test-common/1.7.0.Final/quarkus-test-common-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-core-deployment/1.7.0.Final/quarkus-core-deployment-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/gizmo/gizmo/1.0.4.Final/gizmo-1.0.4.Final.jar:/home/svs/.m2/repository/org/ow2/asm/asm-util/8.0.1/asm-util-8.0.1.jar:/home/svs/.m2/repository/org/ow2/asm/asm-tree/8.0.1/asm-tree-8.0.1.jar:/home/svs/.m2/repository/org/ow2/asm/asm-analysis/8.0.1/asm-analysis-8.0.1.jar:/home/svs/.m2/repository/io/quarkus/quarkus-devtools-utilities/1.7.0.Final/quarkus-devtools-utilities-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-builder/1.7.0.Final/quarkus-builder-1.7.0.Final.jar:/home/svs/.m2/repository/io/quarkus/quarkus-jsonp-deployment/1.7.0.Final/quarkus-jsonp-deployment-1.7.0.Final.jar:/home/svs/.m2/repository/org/jboss/logging/commons-logging-jboss-logging/1.0.0.Final/commons-logging-jboss-logging-1.0.0.Final.jar:/home/svs/.m2/repository/org/junit/jupiter/junit-jupiter/5.6.2/junit-jupiter-5.6.2.jar:/home/svs/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.6.2/junit-jupiter-api-5.6.2.jar:/home/svs/.m2/repository/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.jar:/home/svs/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/home/svs/.m2/repository/org/junit/platform/junit-platform-commons/1.6.2/junit-platform-commons-1.6.2.jar:/home/svs/.m2/repository/org/junit/jupiter/junit-jupiter-params/5.6.2/junit-jupiter-params-5.6.2.jar:/home/svs/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.6.2/junit-jupiter-engine-5.6.2.jar:/home/svs/.m2/repository/org/junit/platform/junit-platform-engine/1.6.2/junit-platform-engine-1.6.2.jar:/home/svs/.m2/repository/com/thoughtworks/xstream/xstream/1.4.11.1/xstream-1.4.11.1.jar:/home/svs/.m2/repository/xmlpull/xmlpull/1.1.3.1/xmlpull-1.1.3.1.jar:/home/svs/.m2/repository/xpp3/xpp3_min/1.1.4c/xpp3_min-1.1.4c.jar:/home/svs/.m2/repository/io/rest-assured/rest-assured/4.3.0/rest-assured-4.3.0.jar:/home/svs/.m2/repository/org/codehaus/groovy/groovy/3.0.2/groovy-3.0.2.jar:/home/svs/.m2/repository/org/codehaus/groovy/groovy-xml/3.0.2/groovy-xml-3.0.2.jar:/home/svs/.m2/repository/org/apache/httpcomponents/httpclient/4.5.12/httpclient-4.5.12.jar:/home/svs/.m2/repository/org/apache/httpcomponents/httpcore/4.4.13/httpcore-4.4.13.jar:/home/svs/.m2/repository/commons-codec/commons-codec/1.14/commons-codec-1.14.jar:/home/svs/.m2/repository/org/apache/httpcomponents/httpmime/4.5.3/httpmime-4.5.3.jar:/home/svs/.m2/repository/org/hamcrest/hamcrest/2.1/hamcrest-2.1.jar:/home/svs/.m2/repository/org/ccil/cowan/tagsoup/tagsoup/1.2.1/tagsoup-1.2.1.jar:/home/svs/.m2/repository/io/rest-assured/json-path/4.3.0/json-path-4.3.0.jar:/home/svs/.m2/repository/org/codehaus/groovy/groovy-json/3.0.2/groovy-json-3.0.2.jar:/home/svs/.m2/repository/io/rest-assured/rest-assured-common/4.3.0/rest-assured-common-4.3.0.jar:/home/svs/.m2/repository/io/rest-assured/xml-path/4.3.0/xml-path-4.3.0.jar:/home/svs/.m2/repository/org/apache/commons/commons-lang3/3.9/commons-lang3-3.9.jar:/home/svs/.m2/repository/jakarta/xml/bind/jakarta.xml.bind-api/2.3.2/jakarta.xml.bind-api-2.3.2.jar:/home/svs/.m2/repository/jakarta/activation/jakarta.activation-api/1.2.1/jakarta.activation-api-1.2.1.jar:/home/svs/.m2/repository/org/apache/sling/org.apache.sling.javax.activation/0.1.0/org.apache.sling.javax.activation-0.1.0.jar com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit5 quarkus.problem.AResourceTest,testHelloEndpoint
Connected to the target VM, address: '127.0.0.1:47665', transport: 'socket'
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2020-08-23 20:37:57,322 INFO  [io.quarkus] (main) Quarkus 1.7.0.Final on JVM started in 2.516s. Listening on: http://0.0.0.0:8081
2020-08-23 20:37:57,340 INFO  [io.quarkus] (main) Profile test activated. 
2020-08-23 20:37:57,340 INFO  [io.quarkus] (main) Installed features: [agroal, cdi, hibernate-orm, jdbc-postgresql, mutiny, narayana-jta, resteasy, resteasy-jsonb, smallrye-context-propagation]

WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.codehaus.groovy.reflection.ReflectionUtils (jar:file:/home/svs/.m2/repository/org/codehaus/groovy/groovy/3.0.2/groovy-3.0.2.jar!/) to constructor java.lang.AssertionError(java.lang.String)
WARNING: Please consider reporting this to the maintainers of org.codehaus.groovy.reflection.ReflectionUtils
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release


java.lang.AssertionError: 1 expectation failed.
JSON path id doesn't match.
Expected: is <3>
  Actual: -46


	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.codehaus.groovy.reflection.CachedConstructor.invoke(CachedConstructor.java:72)
	at org.codehaus.groovy.reflection.CachedConstructor.doConstructorInvoke(CachedConstructor.java:59)
	at org.codehaus.groovy.runtime.callsite.ConstructorSite$ConstructorSiteNoUnwrap.callConstructor(ConstructorSite.java:84)
	at org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallConstructor(CallSiteArray.java:59)
	at org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:263)
	at org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:277)
	at io.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure.validate(ResponseSpecificationImpl.groovy:493)
	at io.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure$validate$1.call(Unknown Source)
	at io.restassured.internal.ResponseSpecificationImpl.validateResponseIfRequired(ResponseSpecificationImpl.groovy:674)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.codehaus.groovy.runtime.callsite.PlainObjectMetaMethodSite.doInvoke(PlainObjectMetaMethodSite.java:43)
	at org.codehaus.groovy.runtime.callsite.PogoMetaMethodSite$PogoCachedMethodSiteNoUnwrapNoCoerce.invoke(PogoMetaMethodSite.java:193)
	at org.codehaus.groovy.runtime.callsite.PogoMetaMethodSite.callCurrent(PogoMetaMethodSite.java:61)
	at org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:185)
	at io.restassured.internal.ResponseSpecificationImpl.body(ResponseSpecificationImpl.groovy:261)
	at io.restassured.specification.ResponseSpecification$body$1.callCurrent(Unknown Source)
	at io.restassured.internal.ResponseSpecificationImpl.body(ResponseSpecificationImpl.groovy:108)
	at io.restassured.internal.ValidatableResponseOptionsImpl.body(ValidatableResponseOptionsImpl.java:244)
	at io.restassured.internal.ValidatableResponseImpl.super$2$body(ValidatableResponseImpl.groovy)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:107)
	at groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:323)
	at groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1262)
	at org.codehaus.groovy.runtime.ScriptBytecodeAdapter.invokeMethodOnSuperN(ScriptBytecodeAdapter.java:144)
	at io.restassured.internal.ValidatableResponseImpl.body(ValidatableResponseImpl.groovy:298)
	at io.restassured.internal.ValidatableResponseImpl.body(ValidatableResponseImpl.groovy)
	at quarkus.problem.AResourceTest.testHelloEndpoint(AResourceTest.java:45)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at io.quarkus.test.junit.QuarkusTestExtension.runExtensionMethod(QuarkusTestExtension.java:743)
	at io.quarkus.test.junit.QuarkusTestExtension.interceptTestMethod(QuarkusTestExtension.java:650)
	at org.junit.jupiter.engine.execution.ExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(ExecutableInvoker.java:115)
	at org.junit.jupiter.engine.execution.ExecutableInvoker.lambda$invoke$0(ExecutableInvoker.java:105)
	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:149)
	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:140)
	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:84)
	at org.junit.jupiter.engine.execution.ExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(ExecutableInvoker.java:115)
	at org.junit.jupiter.engine.execution.ExecutableInvoker.lambda$invoke$0(ExecutableInvoker.java:105)
	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
	at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:104)
	at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:98)
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$6(TestMethodTestDescriptor.java:212)
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:208)
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:137)
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:71)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:135)
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125)
	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123)
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:122)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:80)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139)
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125)
	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123)
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:122)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:80)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139)
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125)
	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123)
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:122)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:80)
	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:32)
	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:51)
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:248)
	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$5(DefaultLauncher.java:211)
	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:226)
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:199)
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:132)
	at com.intellij.junit5.JUnit5IdeaTestRunner.startRunnerWithArgs(JUnit5IdeaTestRunner.java:71)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:220)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:53)


2020-08-23 20:37:59,351 INFO  [io.quarkus] (main) Quarkus stopped in 0.028s
Disconnected from the target VM, address: '127.0.0.1:47665', transport: 'socket'

Process finished with exit code 255
```