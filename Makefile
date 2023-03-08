galaxy: Dockerfile.galaxy
	docker build -t astrograzl/galaxy:alpine -f Dockerfile.galaxy .

reactor: Dockerfile.reactor
	docker build -t astrograzl/reactor:alpine -f Dockerfile.reactor .
