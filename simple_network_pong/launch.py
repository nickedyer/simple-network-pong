import os
from pathlib import Path
import argparse
import pygame
import sys
from simple_network_pong.game_files.game import main as game_main


def main():
    """
    Launch script for Simple Network Pong
    """

    # Start the game.
    game_main()

    # Cleanup
    pygame.quit()
    sys.exit()
