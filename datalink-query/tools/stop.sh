#!/bin/bash
ps -ef|grep Data-Link |grep -v grep| awk '{print $2}'|xargs kill -9