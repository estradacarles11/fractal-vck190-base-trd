# VCK190 Base TRD

The Versal Base TRD consists of a series of platforms, accelerators and Jupyter
notebooks targeting the VCK190 evaluation board. A platform is a Vivado design
with a pre-instantiated set of I/O interfaces and a corresponding PetaLinux BSP
and image that includes the required kernel drivers and user-space libraries to
exercise those interfaces. Accelerators are mapped to FPGA logic resources
and/or AI Engine cores and stitched into the platform using the Vitis toolchain.

Following is the list of Platform design available in 2020.2:

| Platform Name  | Description  |  Links |
| -------------- | ------------- | ---------------- |
| Platform1 | The Versal Base Targeted Reference Design Platform 1 targets VCK190 Evaluation board using 2020.2 tool chain. Platform1 captures video from either a file source, USB webcam or MIPI image sensor and displays it on a Jupyter Notebook or a HDMI monitor. Along with video, audio from a file can be replayed using a HDMI transmitter. Accelerator functions can also be added to this platform using Vitis. Supported acceleration function in this design is a 2D Filter. |   <ul><li><a href="https://xilinx.github.io/vck190-base-trd/build/html/index.html">Tutorials</a></li><li><a href="https://www.xilinx.com/member/vck190_headstart/ug1442-versal-acap-vck190_WtMkX.pdf">User Guide</a></li><li><a href="https://www.xilinx.com/member/forms/download/trd-license-versal.html?filename=vck190_es1_base_trd_platform1_2020.2_v0.5.zip">Reference Design</a></li></ul>
| Platform2 | The Versal Base Targeted Reference Design Platform 2 targets VCK190 Evaluation board using 2020.2 tool chain. Platform2 captures video from either a file source, USB webcam or Quad MIPI image sensor and displays it on a Jupyter Notebook or a HDMI monitor.  Along with video, audio from a file can be replayed using a HDMI transmitter. Accelerator functions can also be added to this platform using Vitis. Supported acceleration function in this design is a 2D Filter. | <ul><li><a href="https://xilinx.github.io/vck190-base-trd/build/html/index.html">Tutorials</a></li><li><a href="https://www.xilinx.com/member/vck190_headstart/ug1442-versal-acap-vck190_WtMkX.pdf">User Guide</a></li><li><a href="https://www.xilinx.com/member/forms/download/trd-license-versal.html?filename=vck190_es1_base_trd_platform2_2020.2_v0.5.zip">Reference Design</a></li></ul>
| Platform3 | The Versal Base Targeted Reference Design Platform 3 targets VCK190 Evaluation board using 2020.2 tool chain. Platform3 captures video from either a file source, USB webcam or HDMI receiver and displays it on a Jupyter Notebook or a HDMI monitor. Along with video, audio from a file or HDMI receiver can  be replayed using a HDMI transmitter. Accelerator functions can also be added to this platform using Vitis. Supported acceleration function in this design is a 2D Filter. |  <ul><li><a href="https://xilinx.github.io/vck190-base-trd/build/html/index.html">Tutorials</a></li><li><a href="https://www.xilinx.com/member/vck190_headstart/ug1442-versal-acap-vck190_WtMkX.pdf">User Guide</a></li><li><a href="https://www.xilinx.com/member/forms/download/trd-license-versal.html?filename=vck190_es1_base_trd_platform3_2020.2_v0.5.zip">Reference Design</a></li></ul>
