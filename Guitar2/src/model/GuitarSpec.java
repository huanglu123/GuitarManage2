package model;

public class GuitarSpec {
	private static String builder; 
	  private static String model;
	  private static String type;
	
	  private static String backWood;
	  private static String topWood;

	  
	  
	  public GuitarSpec(String builder, String model, String type,
	                     String backWood, String topWood) {
	    this.builder = builder;
	    this.model = model;
	    this.type = type;
	    
	    this.backWood = backWood;
	    this.topWood = topWood;
	  }

	  public static String getBuilder() {
			return builder;
		}

		public void setBuilder(String builder) {
			this.builder = builder;
		}

		public static String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public static String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public static String getBackWood() {
			return backWood;
		}

		public void setBackWood(String backWood) {
			this.backWood = backWood;
		}

		public static String getTopWood() {
			return topWood;
		}

		public void setTopWood(String topWood) {
			this.topWood = topWood;
		}

	
	  //返回布尔类型。
	  public boolean matches(GuitarSpec otherSpec) {
	    if (builder != otherSpec.builder)
	      return false;
	    if ((model != null) && (!model.equals("")) &&
	        (!model.toLowerCase().equals(otherSpec.model.toLowerCase())))
	      return false;
	    if (type != otherSpec.type)
	      return false;
	   
	    if (backWood != otherSpec.backWood)
	      return false;
	    if (topWood != otherSpec.topWood)
	      return false;
	    return true;
	  }

}