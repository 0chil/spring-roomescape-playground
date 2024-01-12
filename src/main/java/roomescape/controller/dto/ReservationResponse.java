package roomescape.controller.dto;

import java.time.LocalDate;

public record ReservationResponse(Long id, String name, LocalDate date, String time) {
}
