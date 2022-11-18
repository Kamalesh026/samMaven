package org.suit;

import org.junit.Jsam;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
public class suite {
@Test
public void excuteAlll() {
Result r = JUnitCore.runClasses(Jsam.class);
System.out.println("count run"+r.getRunCount());
System.out.println("count failure"+r.getFailureCount());
System.out.println("count ingore"+r.getIgnoreCount());
}
}
