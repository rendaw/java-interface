package com.zarbosoft.interface1.events;

import com.zarbosoft.interface1.Configuration;
import com.zarbosoft.pidgoon.events.MatchingEvent;

@Configuration(name = "array-close")
public class InterfaceArrayCloseEvent implements InterfaceEvent {

	@Override
	public boolean matches(final MatchingEvent event) {
		return event.getClass() == getClass();
	}

	@Override
	public String toString() {
		return String.format("ARRAY_CLOSE");
	}
}
