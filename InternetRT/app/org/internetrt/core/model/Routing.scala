package org.internetrt.core.model
import org.internetrt.core.signalsystem.Signal
import org.internetrt.core.signalsystem.SignalResponse
import org.internetrt.core.signalsystem.ObjectResponse

//TODO provide a tool set to help retrieve&consume the information in the structure
class Routing(xml:String) {
  def getNextOutput(state:String, input:Signal):SignalResponse = new ObjectResponse("Stub")
}

abstract class RoutingInstance(r:Routing){
  val id:String// It's a random id, used to pass along the workflow, s.t. user can identify the ligal running workflow
  val timestamp:Int
  val state:String
   def acceptRequest(s:Signal)
  def getOutputAdapter={}
}