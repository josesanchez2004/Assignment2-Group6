package org.jfree.data;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ 
	CombineTest.class,
	ConstrainTests.class,
	ContainTests.class,
	DataUtilitiesTest.class,
	ExpandRageTest.class,
	GetLowerBoundTests.class,
	GetUpperBoundTests.class,
	IntersectsTests.class,
	RangeEqualsTest.class,
	RangeExpandToIncludeTests.class,
	RangeGetCentralValueTests.class,
	RangeGetLengthTests.class,
	ToStringTests.class,
	ShiftTests.class
	
})

public class AllTests {


}
