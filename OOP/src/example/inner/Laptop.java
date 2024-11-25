package example.inner;

public class Laptop {
	
	private class MemoryImpl implements MemoryI {
		
		private String memoryCapacity;
		
		private MemoryImpl(String memoryCapacity) {
			this.memoryCapacity = memoryCapacity;
		}
		
		@Override
		public String getMemoryCapacity() {
			return memoryCapacity;
		}
	}
	
	public MemoryI setMemoryCapacity(String memoryCapacity) {
		return new MemoryImpl(memoryCapacity);
	}

}
