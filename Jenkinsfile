node{
	stage 'checkout'
	git url: 'https://github.com/ydinesh1512/dk_Eclips_ci.git'
	def mvnHome = tool 'M3'
	
	stage 'build'
	bat "${mvnHome}/bin/mvn clean test sonar:sonar"
	step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
}
