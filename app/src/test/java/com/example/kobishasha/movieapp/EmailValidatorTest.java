package com.example.kobishasha.movieapp;
import com.example.kobishasha.movieapp.Utils.UtilsEmail;

import org.junit.Test;
import java.util.regex.Pattern;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
/**
 * Created by kobishasha on 16/08/2017.
 */

public class EmailValidatorTest {
// heyyyyyyy
    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertThat(UtilsEmail.isValidEmail("kobi@cropx.com"),equalTo(true));
    }
}
