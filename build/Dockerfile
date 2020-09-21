FROM jenkins/jenkins:lts
COPY --chown=jenkins plugins.txt /var/jenkins_home/
RUN jenkins-plugin-cli --plugin-file /var/jenkins_home/plugins.txt 
COPY --chown=jenkins jobs /var/jenkins_home/jobs/
COPY --chown=jenkins config.xml /var/jenkins_home/
COPY dsl-settings.groovy /usr/share/jenkins/ref/init.groovy.d/dsl-settings.groovy