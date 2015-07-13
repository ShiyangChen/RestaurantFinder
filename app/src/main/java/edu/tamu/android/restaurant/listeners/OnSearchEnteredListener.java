package edu.tamu.android.restaurant.listeners;

/**
 * OnSearchEnteredListener This is the interface bridges the tab host activity
 * and the search fragment
 * 
 * @author Shiyang Chen
 * 
 */
public interface OnSearchEnteredListener {

	/**
	 * Called when user entered the location query
	 * 
	 * @param query
	 *            is the query to the location, null for current location
	 */
	public void onSearchEntered(String query);
}
