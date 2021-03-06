/*
 * Copyright (C) 2017 Yaroslav Mytkalyk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.doctoror.particlesdrawable.contract;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Keep;

/**
 * Particles scene configuration, makes sure all configuration fields are available.
 */
@Keep
public interface SceneConfiguration {

    /**
     * Set number of particles to draw per scene.
     *
     * @param density the number of particles to draw per scene
     * @throws IllegalArgumentException if density is negative
     */
    void setDensity(@IntRange(from = 0) int density);

    /**
     * Returns the number of particles in the scene
     *
     * @return the number of particles in the scene
     */
    int getDensity();

    /**
     * Set a delay per frame in milliseconds.
     *
     * @param delay delay between frames
     * @throws IllegalArgumentException if delay is a negative number
     */
    void setFrameDelay(@IntRange(from = 0) int delay);

    /**
     * Returns a delay per frame in milliseconds.
     *
     * @return delay between frames
     */
    int getFrameDelay();

    /**
     * Set the line color. Note that the color alpha is ignored and will be calculated depending on
     * distance between particles.
     *
     * @param lineColor line color to use
     */
    void setLineColor(@ColorInt int lineColor);

    /**
     * Returns the connection line color
     *
     * @return the connection line color
     */
    @ColorInt
    int getLineColor();

    /**
     * Set the maximum distance when the connection line is still drawn between particles.
     *
     * @param lineLength maximum distance for connection lines
     */
    void setLineLength(@FloatRange(from = 0) float lineLength);

    /**
     * Returns the maximum distance when the connection line is still drawn between particles
     *
     * @return maximum distance for connection lines
     */
    float getLineLength();

    /**
     * Set a line thickness
     *
     * @param lineThickness line thickness
     */
    void setLineThickness(@FloatRange(from = 1) float lineThickness);

    /**
     * Returns the connection like thickness
     *
     * @return the connection line thickness
     */
    float getLineThickness();

    /**
     * Set the particle color
     *
     * @param color particle color to use
     */
    void setParticleColor(@ColorInt int color);

    /**
     * Returns the particle color
     *
     * @return the particle color
     */
    @ColorInt
    int getParticleColor();

    /**
     * Set particle radius range
     *
     * @param minRadius smallest particle radius
     * @param maxRadius largest particle radius
     */
    void setParticleRadiusRange(
            @FloatRange(from = 0.5f) float minRadius,
            @FloatRange(from = 0.5f) float maxRadius);

    /**
     * Largest particle radius
     *
     * @return largest particle radius
     */
    float getParticleRadiusMax();

    /**
     * Returns smallest particle radius
     *
     * @return smallest particle radius
     */
    float getParticleRadiusMin();

    /**
     * Sets speed factor. Use this to control speed.
     *
     * @param speedFactor speed factor
     */
    void setSpeedFactor(@FloatRange(from = 0) final float speedFactor);

    /**
     * Returns the speed factor.
     *
     * @return the speed factor
     */
    float getSpeedFactor();
}
