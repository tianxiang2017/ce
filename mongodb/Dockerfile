FROM mongo:3
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

ADD init.sh /init.sh
ADD ./dump /
ADD ./sources.list /

# mv /etc/apt/sources.list /etc/apt/sources.list.bak && mv sources.list /etc/apt/ && \ add by ztx
RUN \
 chmod +x /init.sh && \
 mv /etc/apt/sources.list /etc/apt/sources.list.bak && mv sources.list /etc/apt/ && \
 apt-get update && apt-get dist-upgrade -y --force-yes && \
 apt-get install psmisc -y -q && \
 apt-get autoremove -y && apt-get clean && \
 rm -rf /var/cache/* && rm -rf /var/lib/apt/lists/*

ENTRYPOINT ["/init.sh"]