FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
	file://0001-arm-zynq-Add-MAX20087-driver.patch \
	file://0002-arm-zynq-Add-avt_multi_sensor_fmc-driver.patch \
	file://0003-max9286-serdes-Fix-source-pad-media-format.patch \
	file://0004-ar0231-Fix-the-media-bus-format-to-GRBG.patch \
	file://0005-avt_multi_sensor_fmc-Add-dependency-on-REGULATOR.patch \
	file://0006-max20087-Remove-unused-members.patch \
	file://0001-i2c-free_clk.patch \
	file://0003-drm-xlnx_mixer-Dont-enable-primary-plane-by-default.patch \
"
