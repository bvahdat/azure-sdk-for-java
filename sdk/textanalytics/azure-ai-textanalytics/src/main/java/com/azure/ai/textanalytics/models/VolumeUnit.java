// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.models;

import com.azure.core.util.ExpandableStringEnum;

import java.util.Collection;

/** Defines values for VolumeUnit. */
public final class VolumeUnit extends ExpandableStringEnum<VolumeUnit> {
    /** Static value Unspecified for VolumeUnit. */
    public static final VolumeUnit UNSPECIFIED = fromString("Unspecified");

    /** Static value CubicMeter for VolumeUnit. */
    public static final VolumeUnit CUBIC_METER = fromString("CubicMeter");

    /** Static value CubicCentimeter for VolumeUnit. */
    public static final VolumeUnit CUBIC_CENTIMETER = fromString("CubicCentimeter");

    /** Static value CubicMillimeter for VolumeUnit. */
    public static final VolumeUnit CUBIC_MILLIMETER = fromString("CubicMillimeter");

    /** Static value Hectoliter for VolumeUnit. */
    public static final VolumeUnit HECTOLITER = fromString("Hectoliter");

    /** Static value Decaliter for VolumeUnit. */
    public static final VolumeUnit DECALITER = fromString("Decaliter");

    /** Static value Liter for VolumeUnit. */
    public static final VolumeUnit LITER = fromString("Liter");

    /** Static value Centiliter for VolumeUnit. */
    public static final VolumeUnit CENTILITER = fromString("Centiliter");

    /** Static value Milliliter for VolumeUnit. */
    public static final VolumeUnit MILLILITER = fromString("Milliliter");

    /** Static value CubicYard for VolumeUnit. */
    public static final VolumeUnit CUBIC_YARD = fromString("CubicYard");

    /** Static value CubicInch for VolumeUnit. */
    public static final VolumeUnit CUBIC_INCH = fromString("CubicInch");

    /** Static value CubicFoot for VolumeUnit. */
    public static final VolumeUnit CUBIC_FOOT = fromString("CubicFoot");

    /** Static value CubicMile for VolumeUnit. */
    public static final VolumeUnit CUBIC_MILE = fromString("CubicMile");

    /** Static value FluidOunce for VolumeUnit. */
    public static final VolumeUnit FLUID_OUNCE = fromString("FluidOunce");

    /** Static value Teaspoon for VolumeUnit. */
    public static final VolumeUnit TEASPOON = fromString("Teaspoon");

    /** Static value Tablespoon for VolumeUnit. */
    public static final VolumeUnit TABLESPOON = fromString("Tablespoon");

    /** Static value Pint for VolumeUnit. */
    public static final VolumeUnit PINT = fromString("Pint");

    /** Static value Quart for VolumeUnit. */
    public static final VolumeUnit QUART = fromString("Quart");

    /** Static value Cup for VolumeUnit. */
    public static final VolumeUnit CUP = fromString("Cup");

    /** Static value Gill for VolumeUnit. */
    public static final VolumeUnit GILL = fromString("Gill");

    /** Static value Pinch for VolumeUnit. */
    public static final VolumeUnit PINCH = fromString("Pinch");

    /** Static value FluidDram for VolumeUnit. */
    public static final VolumeUnit FLUID_DRAM = fromString("FluidDram");

    /** Static value Barrel for VolumeUnit. */
    public static final VolumeUnit BARREL = fromString("Barrel");

    /** Static value Minim for VolumeUnit. */
    public static final VolumeUnit MINIM = fromString("Minim");

    /** Static value Cord for VolumeUnit. */
    public static final VolumeUnit CORD = fromString("Cord");

    /** Static value Peck for VolumeUnit. */
    public static final VolumeUnit PECK = fromString("Peck");

    /** Static value Bushel for VolumeUnit. */
    public static final VolumeUnit BUSHEL = fromString("Bushel");

    /** Static value Hogshead for VolumeUnit. */
    public static final VolumeUnit HOGSHEAD = fromString("Hogshead");

    /**
     * Creates or finds a VolumeUnit from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VolumeUnit.
     */
    public static VolumeUnit fromString(String name) {
        return fromString(name, VolumeUnit.class);
    }

    /**
     * Gets known VolumeUnit values.
     *
     * @return known VolumeUnit values.
     */
    public static Collection<VolumeUnit> values() {
        return values(VolumeUnit.class);
    }
}
