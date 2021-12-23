package org.icepear.echarts;

import org.icepear.echarts.components.coord.radar.RadarAxis;
import org.icepear.echarts.components.coord.radar.RadarIndicator;
import org.icepear.echarts.origin.util.SeriesOption;

public abstract class RadarChart<T extends Chart<?, ?>, E extends SeriesOption> extends Chart<T, E> {
    public RadarChart(final Class<T> clazz, final Class<E> seriesClazz) {
        super(clazz, seriesClazz);
    }

    public T setRadarAxis(RadarIndicator[] radarAxis) {
        option.setRadar(new RadarAxis().setIndicator(radarAxis));
        return self;
    }

    public T setRadarAxis(RadarAxis radarAxis) {
        option.setRadar(radarAxis);
        return self;
    }
}
