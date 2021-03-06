package io.codearte.duramen.handler;

import io.codearte.duramen.event.Event;

/**
 * Implement that interface in your event handler to receive events of generic E class
 *
 * @author Jakub Kubrynski
 */
public interface EventHandler<E extends Event> {

	void onEvent(E event);
}
