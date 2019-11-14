DESCRIPTION = "Base TRD related Packages"

inherit packagegroup

MOVIE_PACKAGES = " \
	bigbuckbunny-360p-vp9-webm \
	bigbuckbunny-480p-vp9-webm \
	"

XRT_PACKAGES = " \
	opencl-clhpp-dev \
	opencl-headers-dev \
	xrt \
	xrt-dev \
	zocl \
	"

BASE_TRD_PACKAGES = " \
	packagegroup-core-tools-debug \
	packagegroup-petalinux-display-debug \
	packagegroup-petalinux-gstreamer \
	packagegroup-petalinux-opencv \
	packagegroup-petalinux-self-hosted \
	packagegroup-petalinux-v4lutils \
	packagegroup-python3-jupyter \
	base-trd-notebooks \
	haveged \
	git \
	gst-plugins-xlnx \
	gst-sdx \
	gstreamer1.0-python \
	jupyter-startup \
	kernel-module-hdmi \
	kms++ \
	nodejs \
	nodejs-npm \
	python3-dev \
	tcf-agent \
	trd-files \
	${MOVIE_PACKAGES} \
	${XRT_PACKAGES} \
	"

BASE_TRD_PACKAGES_append_versal = " \
	ai-engine-driver \
	"

RDEPENDS_${PN} = "${BASE_TRD_PACKAGES}"
