package com.SpringCore.Standalone.Collections;

import java.util.List;
import java.util.Map;

public class person {
private List<String> friends;
private Map<String, Integer> fee_Structure;

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}

public Map<String, Integer> getFee_Structure() {
	return fee_Structure;
}

public void setFee_Structure(Map<String, Integer> fee_Structure) {
	this.fee_Structure = fee_Structure;
}

@Override
public String toString() {
	return "person [friends=" + friends + ", fee_Structure=" + fee_Structure + "]";
}





}
