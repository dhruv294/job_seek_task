pipelineJob("pipeline-seed-nightly-build"){
	definition {
		cpsScm {
			scm {
				git {
					remote {
						url "https://github.com/dhruv294/seek_job.git"

					}
				}
				scriptPath "pipeline/jenkinsfile-nightly"
			}
		}
	}
}

