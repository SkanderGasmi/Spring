import pyautogui
import time

# Give yourself a few seconds to switch to the Messenger window
print("Switch to your Messenger window in 2 seconds...")
time.sleep(2)

# Fastest practical scroll loop
try:
    while True:
        pyautogui.scroll(10000)  # maximum scroll per step
        time.sleep(0.01)          # very short pause
except KeyboardInterrupt:
    print("Stopped by user.")
