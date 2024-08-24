# Start with the official MongoDB image
FROM mongo:6.0

# Expose the default MongoDB port
EXPOSE 27017

# If you have custom scripts or configurations, you can add them here.
# COPY ./your-custom-scripts /docker-entrypoint-initdb.d/
