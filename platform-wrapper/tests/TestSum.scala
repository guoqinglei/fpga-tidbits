package TidbitsTestbenches
/*
import Chisel._
import TidbitsPlatformWrapper._
import TidbitsDMA._
import TidbitsStreams._

class TestSum(p: PlatformWrapperParams) extends GenericAccelerator(p) {
  override val io = new GenericAcceleratorIF(p) {
    val start = Bool(INPUT)
    val finished = Bool(OUTPUT)
    val baseAddr = UInt(INPUT, width = p.csrDataBits)
    val byteCount = UInt(INPUT, width = p.csrDataBits)
    val sum = UInt(OUTPUT, width = p.csrDataBits)
  }
  // TODO generate signature with digest function
  io.signature := UInt(20151020)

  val rg = Module(new ReadReqGen(p.toMemReqParams(), 0, 8)).io
  val red = Module(new StreamReducer(p.memDataBits, 0, {_+_})).io

  rg.ctrl.start := io.start
  rg.ctrl.throttle := Bool(false)
  rg.ctrl.baseAddr := io.baseAddr
  rg.ctrl.byteCount := io.byteCount

  red.start := io.start
  red.byteCount := io.byteCount

  io.sum := red.reduced
  io.finished := red.finished

  rg.reqs <> io.memPort(0).memRdReq
  red.streamIn.valid := io.memPort(0).memRdRsp.valid
  red.streamIn.bits := io.memPort(0).memRdRsp.bits.readData
  io.memPort(0).memRdRsp.ready := red.streamIn.ready
}

trait TestSumParams extends PlatformWrapperParams {
  val numMemPorts = 1
  val accelName = "TestSum"
}

object TestSumParamsWolverine extends WX690TParams with TestSumParams

object TestSumMain {
  def apply() = {
    val instFxn = {p: PlatformWrapperParams => new TestSum(p)}
    chiselMain(Array("--v"), () => Module(new WolverinePlatformWrapper(TestSumParamsWolverine, instFxn)))
  }
}
*/