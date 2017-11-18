/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.sda.mvcexample.controller;

import com.sda.mvcexample.model.Fatigue;
import com.sda.mvcexample.model.GiantModel;
import com.sda.mvcexample.model.Health;
import com.sda.mvcexample.model.Nourishment;
import com.sda.mvcexample.view.GiantView;

/**
 * 
 * GiantController can update the giant data and redraw it using the view.
 *
 */
public class GiantController {

  public GiantModel giant;
  public GiantView view;

  public GiantController(GiantModel giant, GiantView view) {
    this.giant = giant;
    this.view = view;
  }

  public Health getHealth() {
    return giant.getHealth();
  }

  public void setHealth(Health health) {
    this.giant.setHealth(health);
  }

  public Fatigue getFatigue() {
    return giant.getFatigue();
  }

  public void setFatigue(Fatigue fatigue) {
    this.giant.setFatigue(fatigue);
  }

  public Nourishment getNourishment() {
    return giant.getNourishment();
  }

  public void setNourishment(Nourishment nourishment) {
    this.giant.setNourishment(nourishment);
  }

  public void updateView() {
    this.view.displayGiant(giant);
  }
}
