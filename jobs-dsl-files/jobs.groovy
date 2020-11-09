// https://jenkinsci.github.io/job-dsl-plugin/#path/pipelineJob

def list_jobs = ['app-1','app-2']
def list_env = ['dev', 'stg', 'pre', 'prd']

for (env_item in [list_env]) {
  list_env.each { env_name ->
    for (repo_item in [list_jobs]) {
      list_jobs.each { job_name ->
        pipelineJob('dsl-' + env_name + '-' + job_name) {
          parameters {
            stringParam('JOB_NAME', job_name, 'product/app name to deploy')
            stringParam('ENV', env_name, 'Environment')

          }
          definition {
              cpsScm {
                  scm {
                    git {
                      remote {
                        // credentials('')
                        url('https://github.com/mauserkar/jenkins-dsl.git')
                        branch('master')
                      }
                    }
                  }
                  scriptPath('jobs-dsl-pipelines/pipeline-demo.groovy')
              }
          }
        }
      }
    }
  }
}
