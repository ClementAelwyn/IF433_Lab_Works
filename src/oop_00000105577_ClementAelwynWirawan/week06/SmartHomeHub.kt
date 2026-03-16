package oop_00000105577_ClementAelwynWirawan.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Device '${device.name}' berhasil ditambahkan ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n=== MEMATIKAN SEMUA PERANGKAT ===")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}