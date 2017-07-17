#!/bin/bash
curl -X POST --data-urlencode 'payload={"channel": "#mongo_build", "text": "Build Started from commit '$(git rev-parse HEAD)'"}' https://hooks.slack.com/services/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
./build.sh &&
curl -X POST --data-urlencode 'payload={"channel": "#mongo_build", "text": "Build Completed"}' https://hooks.slack.com/services/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
