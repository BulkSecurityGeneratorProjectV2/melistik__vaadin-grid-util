package org.vaadin.gridutil.client.renderer.buttonvalue;

/**
 * create the HTML for a view, edit and delete button
 *
 * @author Marten Prieß (http://www.rocketbase.io)
 * @version 1.0
 */
public class VViewEditDeleteButtonValueRenderer extends VButtonValueRenderer {

	public VViewEditDeleteButtonValueRenderer() {
		super(VButtonValueRenderer.VIEW_BITM | VButtonValueRenderer.EDIT_BITM | VButtonValueRenderer.DELETE_BITM);
	}

}
