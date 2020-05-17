package com.fluxtest.fluxtestcommon;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EntitiesDto {
	private SomeEntity se;
	private LateFeeEntity lfe;
}
